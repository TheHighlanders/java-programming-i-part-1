# Java Programming I — Part 1

37 exercises from the University of Helsinki's free
[Java course](https://java-programming.mooc.fi/part-1/).

One folder, one exercise. The exercise is written at the top of its file in
`src/main/java`, with a link to the lesson that teaches it.

## What do I install?

Two things, once.

1. [VS Code](https://code.visualstudio.com/).
2. **Extension Pack for Java**, from the Extensions tab inside VS Code.

Then open this folder: **File → Open Folder**.

![Extensions tab, with Extension Pack for Java ready to install](docs/img/1-extension.png)

## How do I do an exercise?

Try **02 Ada Lovelace** first. It prints one line.

1. Open `part01-Part01_02.AdaLovelace/src/main/java/AdaLovelace.java`.
2. Read the exercise at the top.

   ![AdaLovelace.java open, showing the exercise at the top](docs/img/2-open-file.png)

3. Add your line under `// Write your program here`:

   ```java
   System.out.println("Ada Lovelace");
   ```

4. Click **Run**, just above `public static void main`. Your words appear at the
   bottom.

   ![The Run link above main, and Ada Lovelace printed below](docs/img/3-run.png)

5. Open the Testing tab, the flask on the left. Press play on
   `AdaLovelaceTest`. Green means done.

   ![The Testing tab with AdaLovelaceTest passing](docs/img/4-tests.png)

6. Save, commit, push.

Then do the rest in order.

## How am I graded?

Each push tests all 37 exercises. Your score is in the Actions tab.

A red ✗ means some are unfinished. That is normal until the end. Click a red
one. It shows what your program printed, and what it should have.

**01 Sandbox** and **25 Check Your Indentation** have no test, so they always
pass. Sandbox is yours to play in.

## What if I get stuck?

Read the lesson linked at the top of the file. Then ask in the team chat.

## Credits

Exercises and tests come from
[Java Programming I](https://java-programming.mooc.fi/) at the University of
Helsinki, by the
[Agile Education Research group](https://www.helsinki.fi/en/researchgroups/data-driven-education).
Used under [CC BY-NC-SA 4.0](https://creativecommons.org/licenses/by-nc-sa/4.0/).
See [LICENSE.md](LICENSE.md).
