# Java Programming I — Part 1

37 exercises from the University of Helsinki's free
[Java course](https://java-programming.mooc.fi/part-1/).

Each folder is one exercise. Open its file in `src/main/java` — the exercise and
a link to the lesson are written at the top.

## Set up, once

1. Install [VS Code](https://code.visualstudio.com/).
2. In VS Code, open the Extensions tab and install **Extension Pack for Java**.
3. Open this folder: **File → Open Folder**.

![Extensions tab, with Extension Pack for Java ready to install](docs/img/1-extension.png)

## Your first exercise

Start with **02 Ada Lovelace**. It prints one line.

1. Open `part01-Part01_02.AdaLovelace/src/main/java/AdaLovelace.java`.
2. Read the exercise at the top of the file.

   ![AdaLovelace.java open, showing the exercise at the top](docs/img/2-open-file.png)

3. Write your line under `// Write your program here`:

   ```java
   System.out.println("Ada Lovelace");
   ```

4. Click **Run**, just above `public static void main`. Your text appears at the
   bottom of the window.

   ![The Run link above main, and Ada Lovelace printed below](docs/img/3-run.png)

5. Check it the way the grader will. Open the Testing tab (the flask on the left)
   and press play on `AdaLovelaceTest`. Green means done.

   ![The Testing tab with AdaLovelaceTest passing](docs/img/4-tests.png)

6. Save, commit, and push.

Then do the rest in order.

## Your score

Every push runs all 37 tests. Your score shows up in the Actions tab.

A red ✗ only means some exercises are unfinished, which is normal until the end.
Open the failing one and read the message — it says what your program did wrong.

Two exercises have no real test and always pass: **01 Sandbox**, which is a
scratch file for trying things out, and **25 Check Your Indentation**.

## Stuck?

Read the lesson linked at the top of the file. Then ask in the team chat.

## Credits

Exercises and tests are from the University of Helsinki's
[Java Programming I](https://java-programming.mooc.fi/), by the
[Agile Education Research group](https://www.helsinki.fi/en/researchgroups/data-driven-education),
used under [CC BY-NC-SA 4.0](https://creativecommons.org/licenses/by-nc-sa/4.0/).
See [LICENSE.md](LICENSE.md).
