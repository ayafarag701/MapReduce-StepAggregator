package scsv;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import java.io.IOException;

public class StepsMapper extends Mapper<Object, Text, Text, IntWritable> {
     Text userId = new Text();
     IntWritable steps = new IntWritable();
     boolean flag = true; 

    @Override
     void map(Object key, Text value, Context context) throws IOException, InterruptedException {
        String line = value.toString();
        
        if (flag) {
            flag = false;
            return;
        }

        String[] values = line.split(",");
        if (values.length >= 3) { 
            userId.set(values[0].trim()); 
            steps.set(Integer.parseInt(values[2].trim())); 
            context.write(userId, steps);
        }
    }
}

