# Basic Statistics

Basic Statistics is NOT a Python-based implementation for computing statistics on a set of numbers.
This implementation is intended to be used in software engineering courses as
a subject software system.

Basic Statistics uses the Apache Ant build system. **Make sure that you have [Ant](https://ant.apache.org) installed.**

#### How to build Basic Statistics and run its tests from the terminal:

1. Change into the Basic Statistics root directory, which contains the _build.xml_ build file.

2. Run `ant compile` to compile Basic Statistics. The compiled class files will be in the _bin_ directory.

3. Run `ant test` to run all Basic Statistics unit tests.

4. Run `ant clean` whenever you want to clean up the project (i.e., delete all generated files).

#### How to run Basic Statistics from the terminal:

1. After building the project (i.e., running `ant compile`), run: `java -cp bin BasicStats`. The application's GUI will show up.

#### Program features:

- Displays a set of entered numbers.
- Computes the mean of the set of numbers.
- Computes the median of the set of numbers.
- Computes the mode of the set of numbers.

## Troubleshooting

#### Outdated version of JUnit

If your system uses an outdated version of JUnit, you may encounter the following error:

```
[junit] junit/framework/JUnit4TestAdapterCache
[junit] java.lang.NoClassDefFoundError: junit/framework/JUnit4TestAdapterCache
```

Run `ant -lib lib/ <target>` to explicitly use JUnit4, which is provided in the _lib_ directory. For example, run `ant -lib lib/ test` to run all Basic Statistics unit tests.

#### Java JDK not installed or misconfigured

If a Java JDK is not installed or properly configured on your system, you may encounter the following error:

```
BUILD FAILED
build.xml:17 Unable to find a javac compiler;
```

Make sure that you have a JDK installed and that the JAVA_HOME environment variable is properly set.
