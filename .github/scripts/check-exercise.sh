#!/usr/bin/env bash
# Reports whether one exercise passed, using the test results already on disk.
# The tests all run once, earlier in the workflow; this just reads the report,
# so it costs no extra time.
set -uo pipefail

dir="$1"
reports=("$dir"/target/surefire-reports/TEST-*.xml)

if [ ! -e "${reports[0]}" ]; then
  echo "Your code has an error, so the tests could not run."
  echo "Open the 'Run every test once' step above to see it."
  exit 1
fi

if grep -qE '<(failure|error)' "${reports[@]}"; then
  # Show the messages the tests print, which say what went wrong.
  grep -ohE '(failure|error)[^>]*message="[^"]*"' "${reports[@]}" \
    | sed -E 's/.*message="//; s/"$//' \
    | sed -E 's/&quot;/"/g; s/&apos;/'"'"'/g; s/&lt;/</g; s/&gt;/>/g; s/&amp;/\&/g' \
    | awk '!seen[$0]++' \
    | head -3
  exit 1
fi

echo "Passed"
