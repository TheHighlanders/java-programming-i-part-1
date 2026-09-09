# Java Programming I — Part 1

All 37 exercises from Part 1 of the University of Helsinki
[Java Programming I](https://java-programming.mooc.fi/part-1/) MOOC, set up to be
graded automatically by GitHub Classroom.

Read the course material for a section **before** starting its exercises. The
material explains the concepts and gives the exact wording each program must print:

<https://java-programming.mooc.fi/part-1/>

## What to do

Each folder is one exercise. Write your solution in the file under `src/main/java/`.
**Do not edit anything in `src/test/java/`** — those are the grader's tests.

Commit and push. Every push runs all 37 tests and reports your score — one point per
exercise — in the Actions tab and back to GitHub Classroom. Push as often as you like;
there's no penalty for a failing run.

### 1. Getting started with programming

| # | Exercise | File to edit |
|---|---|---|
| 01 | Sandbox | `part01-Part01_01.Sandbox/src/main/java/Sandbox.java` |

### 2. Printing

| # | Exercise | File to edit |
|---|---|---|
| 02 | Ada Lovelace | `part01-Part01_02.AdaLovelace/src/main/java/AdaLovelace.java` |
| 03 | Once Upon a Time | `part01-Part01_03.OnceUponATime/src/main/java/OnceUponATime.java` |
| 04 | Dinosaur | `part01-Part01_04.Dinosaur/src/main/java/Dinosaur.java` |

### 3. Reading input

| # | Exercise | File to edit |
|---|---|---|
| 05 | Message | `part01-Part01_05.Message/src/main/java/Message.java` |
| 06 | Hi Ada Lovelace! | `part01-Part01_06.HiAdaLovelace/src/main/java/HiAdaLovelace.java` |
| 07 | Message Three Times | `part01-Part01_07.MessageThreeTimes/src/main/java/MessageThreeTimes.java` |
| 08 | Greeting | `part01-Part01_08.Greeting/src/main/java/Greeting.java` |
| 09 | Conversation | `part01-Part01_09.Conversation/src/main/java/Conversation.java` |
| 10 | Story | `part01-Part01_10.Story/src/main/java/Story.java` |

### 4. Variables

| # | Exercise | File to edit |
|---|---|---|
| 11 | Various Variables | `part01-Part01_11.VariousVariables/src/main/java/VariousVariables.java` |
| 12 | Integer Input | `part01-Part01_12.IntegerInput/src/main/java/IntegerInput.java` |
| 13 | Double Input | `part01-Part01_13.DoubleInput/src/main/java/DoubleInput.java` |
| 14 | Boolean Input | `part01-Part01_14.BooleanInput/src/main/java/BooleanInput.java` |
| 15 | Different Types of Input | `part01-Part01_15.DifferentTypesOfInput/src/main/java/DifferentTypesOfInput.java` |

### 5. Calculating with numbers

| # | Exercise | File to edit |
|---|---|---|
| 16 | Seconds in a day | `part01-Part01_16.SecondsInADay/src/main/java/SecondsInADay.java` |
| 17 | Sum of two numbers | `part01-Part01_17.SumOfTwoNumbers/src/main/java/SumOfTwoNumbers.java` |
| 18 | Sum of three numbers | `part01-Part01_18.SumOfThreeNumbers/src/main/java/SumOfThreeNumbers.java` |
| 19 | Addition formula | `part01-Part01_19.AdditionFormula/src/main/java/AdditionFormula.java` |
| 20 | Multiplication formula | `part01-Part01_20.MultiplicationFormula/src/main/java/MultiplicationFormula.java` |
| 21 | Average of two numbers | `part01-Part01_21.AverageOfTwoNumbers/src/main/java/AverageOfTwoNumbers.java` |
| 22 | Average of three numbers | `part01-Part01_22.AverageOfThreeNumbers/src/main/java/AverageOfThreeNumbers.java` |
| 23 | Simple calculator | `part01-Part01_23.SimpleCalculator/src/main/java/SimpleCalculator.java` |

### 6. Conditional statements

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
| 32 | Odd or even | `part01-Part01_32.OddOrEven/src/main/java/OddOrEven.java` |
| 33 | Password | `part01-Part01_33.Password/src/main/java/Password.java` |
| 34 | Same | `part01-Part01_34.Same/src/main/java/Same.java` |
| 35 | Checking the age | `part01-Part01_35.CheckingTheAge/src/main/java/CheckingTheAge.java` |
| 36 | Leap year | `part01-Part01_36.LeapYear/src/main/java/LeapYear.java` |
| 37 | Gift tax | `part01-Part01_37.GiftTax/src/main/java/GiftTax.java` |
## Running the tests yourself

Optional, but a much faster feedback loop than pushing. You need Java 17+ and Maven.

One exercise — this is the one you'll use most:

```bash
mvn -pl part01-Part01_24.SpeedingTicket test
```

Everything at once:

```bash
mvn -fae test
```

When a test fails it tells you what it expected, for example
`You did not ask user for the speed!`

## Two exercises that always pass

**01 Sandbox** is a scratch file for trying things out, and **25 Check Your
Indentation** is graded on how the source is indented — which the MOOC's own server
checked with a tool this setup does not run. Both have empty tests, so they score a
free point. Do 25 anyway; the point of it is that badly indented code is hard to read.

The other 35 are really graded.

## Credits and licence

Exercise templates and tests are the unmodified originals from the University of
Helsinki's [Java Programming I](https://java-programming.mooc.fi/) MOOC, created by the
[Agile Education Research group](https://www.helsinki.fi/en/researchgroups/data-driven-education).

The course material is licensed
[CC BY-NC-SA 4.0](https://creativecommons.org/licenses/by-nc-sa/4.0/), and this
adaptation is distributed under the same licence.
