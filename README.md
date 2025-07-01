# MapReduce Project - Step Aggregation by Player ID

This project demonstrates how to use **Hadoop MapReduce** in Java to aggregate step counts from fitness tracker data.  
Each record in the input file represents a player’s ID and the number of steps taken in a session. The goal is to calculate the **total steps per player**.

---

## 📊 Example Input Format

```

101,200
102,150
101,300

```

## ✅ Expected Output

```

101	500
102	150

````

---

## 🚀 Features

- **Hadoop MapReduce**: Distributed batch data processing.
- **Custom Mapper**: Parses player ID and step count from each line.
- **Custom Reducer**: Sums total steps for each player.
- **Tested in Cloudera**: Built and tested on Cloudera QuickStart VM.

---

## 🛠️ How to Run

> This project was developed and tested using **Cloudera QuickStart VM**.

1. Open the terminal inside Cloudera.
2. Compile the Java files using Hadoop's compiler:
   ```bash
   hadoop com.sun.tools.javac.Main StepMapper.java StepReducer.java Driver.java
````

3. Package the compiled classes into a JAR:

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
6. Display the output:

   ```bash
   hdfs dfs -cat /output/part-r-00000
   ```

---

## 📂 Dataset Source

The input file used in this project is based on the following dataset:

🔗 [Fitness Tracker Dataset on Kaggle](https://www.kaggle.com/datasets/arnavsmayan/fitness-tracker-dataset)

Download the CSV file from the link above and extract the relevant columns (e.g., user ID and steps) to create your input.

---

## 💻 Technologies Used

* Java
* Hadoop MapReduce
* HDFS (Cloudera Environment)

---

## ℹ️ About

This MapReduce project reads fitness tracking data, aggregates total steps for each player ID, and outputs the results in a structured format.
It serves as a simple example of how MapReduce can be used for distributed data summarization tasks.

```

---

You're now ready to upload this to your GitHub repo `MapReduce-StepAggregator`. Let me know if you want a matching `StepMapper.java`, `StepReducer.java`, and `Driver.java` file template too!
```
