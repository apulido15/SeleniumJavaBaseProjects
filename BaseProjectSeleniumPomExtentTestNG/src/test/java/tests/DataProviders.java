package tests;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DataProviders {

    @DataProvider(name = "csvData")
    public static Object[][] getDataFromCSV() throws Exception {
        List<Object[]> data = new ArrayList<>();
        BufferedReader br = new BufferedReader(
                new FileReader("src/test/resources/Data/LoginData.csv"));
        String line;
        while ((line = br.readLine()) != null) {
            String[] values = line.split(",");
            data.add(values);
        }
        br.close();
        return data.toArray(new Object[0][]);
    }

    @DataProvider(name = "excelData")
    public static Object[][] getDataFromExcel() throws Exception {
        FileInputStream fis = new FileInputStream(
                "src/test/resources/Data/LoginData.xlsx");
        Workbook wb = WorkbookFactory.create(fis);
        Sheet sheet = wb.getSheetAt(0);

        int rows = sheet.getPhysicalNumberOfRows();
        int cols = sheet.getRow(0).getPhysicalNumberOfCells();

        Object[][] data = new Object[rows - 1][cols]; // ignorar encabezado

        for (int i = 1; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                data[i - 1][j] = sheet.getRow(i).getCell(j).toString();
            }
        }
        wb.close();
        return data;
    }

    @DataProvider(name = "jsonData")
    public Object[][] getJsonData() throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        List<Map<String, String>> data = mapper.readValue(
                new File("src/test/resources/Data/LoginFailedData.json"),
                new TypeReference<>() {});

        Object[][] dataArray = new Object[data.size()][1];
        for (int i = 0; i < data.size(); i++) {
            dataArray[i][0] = data.get(i);
        }
        return dataArray;
    }

    @DataProvider(name = "loginData")
    public Object[][] getData() {
        return new Object[][]{
                {"standard_user", "secret_sauce"},
                {"locked_out_user", "secret_sauce"},
                {"problem_user", "secret_sauce"}
        };
    }
}
