# Java 1 — Part 1.6: Conditional statements

Exercises from the University of Helsinki [Java Programming I](https://java-programming.mooc.fi/part-1/6-conditional-statements/)
MOOC, set up to be graded automatically by GitHub Classroom.

Read the course material for each exercise **first** — the material explains the
concepts and gives the exact wording each program must print:

<https://java-programming.mooc.fi/part-1/6-conditional-statements/>

## What to do

Each folder is one exercise. Write your solution in the file under `src/main/java/`:

| # | Exercise | File to edit |
|---|---|---|
| 24 | Speeding Ticket | `part01-Part01_24.SpeedingTicket/src/main/java/SpeedingTicket.java` |
| 25 | Check Your Indentation | `part01-Part01_25.CheckYourIndentation/src/main/java/CheckYourIndentation.java` |
| 26 | Orwell | `part01-Part01_26.Orwell/src/main/java/Orwell.java` |
| 27 | Ancient | `part01-Part01_27.Ancient/src/main/java/Ancient.java` |
| 28 | Positivity | `part01-Part01_28.Positivity/src/main/java/Positivity.java` |
| 29 | Adulthood | `part01-Part01_29.Adulthood/src/main/java/Adulthood.java` |
| 30 | Larger Than or Equal To | `part01-Part01_30.LargerThanOrEqualTo/src/main/java/LargerThanOrEqualTo.java` |
| 31 | Grades and Points | `part01-Part01_31.GradesAndPoints/src/main/java/GradesAndPoints.java` |
| 32 | Odd or Even | `part01-Part01_32.OddOrEven/src/main/java/OddOrEven.java` |
| 33 | Password | `part01-Part01_33.Password/src/main/java/Password.java` |
| 34 | Same | `part01-Part01_34.Same/src/main/java/Same.java` |
| 35 | Checking the Age | `part01-Part01_35.CheckingTheAge/src/main/java/CheckingTheAge.java` |
| 36 | Leap Year | `part01-Part01_36.LeapYear/src/main/java/LeapYear.java` |
| 37 | Gift Tax | `part01-Part01_37.GiftTax/src/main/java/GiftTax.java` |

**Do not edit anything in `src/test/java/`.** Those are the grader's tests.

Commit and push. Every push runs all 14 tests and reports your score — one point
per exercise — in the Actions tab and back to GitHub Classroom. You can push as
many times as you like.

## Running the tests yourself

Optional, but a much faster feedback loop than pushing. You need Java 17+ and Maven.

Everything:

```bash
mvn -fae test
```

One exercise:

```bash
mvn -pl part01-Part01_24.SpeedingTicket test
```

When a test fails it tells you what it expected, e.g.
`You did not ask user for the speed!`

## A note on exercise 25

*Check Your Indentation* is graded on the source code's indentation, which the MOOC's
own server checked with a tool this setup does not run. Its test here is empty, so it
always passes. Fix the indentation anyway — the point of the exercise is that badly
indented code is hard to read.

## Credits and licence

Exercise templates and tests are from the University of Helsinki's
[Java Programming I](https://java-programming.mooc.fi/) MOOC, created by the
[Agile Education Research group](https://www.helsinki.fi/en/researchgroups/data-driven-education).

The course material is licensed
[CC BY-NC-SA 4.0](https://creativecommons.org/licenses/by-nc-sa/4.0/), and this
adaptation is distributed under the same licence.
