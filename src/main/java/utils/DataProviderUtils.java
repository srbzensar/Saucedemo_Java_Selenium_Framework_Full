
package utils;

import org.testng.annotations.DataProvider;
import com.opencsv.CSVReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataProviderUtils {

    @DataProvider(name = "csvData")
    public static Iterator<Object[]> csvDataProvider() throws Exception {
        List<Object[]> testData = new ArrayList<>();
        try (CSVReader reader = new CSVReader(new FileReader("src/main/resources/testdata.csv"))) {
            String[] line;
            reader.readNext(); // skip header
            while ((line = reader.readNext()) != null) {
                testData.add(new Object[] { line[0], line[1] });
            }
        }
        return testData.iterator();
    }
}
