# MapReduce Project - Step Aggregation by Player ID

This project demonstrates how to use **Hadoop MapReduce** in Java to aggregate step counts from fitness tracker data. Each record in the input file represents a player’s ID and the number of steps taken in a session. The goal is to calculate the total number of steps per player.

---

## Example Input Format

```

101,200
102,150
101,300

```

## Expected Output

```

101	500
102	150

````

---

## Features

- **Hadoop MapReduce**: Handles distributed batch processing.
- **Mapper**: Parses player ID and step count from each line.
- **Reducer**: Sums total steps for each unique player ID.
- **Cloudera Environment**: Developed and tested on Cloudera QuickStart VM.

---

## How to Run

> This project was built and executed using the **Cloudera QuickStart VM**.

1. Open the terminal inside Cloudera.
2. Compile the Java files using the Hadoop compiler:
   ```bash
   hadoop com.sun.tools.javac.Main StepMapper.java StepReducer.java Driver.java
````

3. Package the compiled classes into a JAR file:

   ```bash
   jar cf stepcount.jar *.class
   ```
4. Upload your input file to HDFS:

   ```bash
   hdfs dfs -mkdir /input
   hdfs dfs -put data.csv /input
   ```
5. Run the MapReduce job:

   ```bash
   hadoop jar stepcount.jar Driver /input /output
   ```
6. View the output results:

   ```bash
   hdfs dfs -cat /output/part-r-00000
   ```

---

## Technologies Used

* Java
* Hadoop MapReduce
* HDFS (Cloudera)

---

## About

This MapReduce project reads data containing player IDs and their step counts, aggregates the steps for each player, and outputs the total per player. It illustrates how Hadoop MapReduce can be used to perform simple aggregation tasks on large datasets in a distributed environment.

```

---

Let me know if you'd like a matching `Driver.java`, `StepMapper.java`, and `StepReducer.java` template as well!
```
# MapReduce-StepAggregator
