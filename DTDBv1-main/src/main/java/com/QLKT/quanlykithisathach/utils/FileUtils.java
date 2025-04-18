package com.QLKT.quanlykithisathach.utils;

import java.io.File;
import java.io.FileNotFoundException;
import javax.xml.bind.*;

public class FileUtils {

    /**
     * Ghi đối tượng Java vào file XML
     * 
     * @param fileName Đường dẫn tới file XML
     * @param object   Đối tượng cần lưu
     */
    public static void writeXMLtoFile(String fileName, Object object) {
        try {
            JAXBContext context = JAXBContext.newInstance(object.getClass());
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            File file = new File(fileName);
            marshaller.marshal(object, file);
        } catch (JAXBException e) {
            System.err.println("Lỗi khi ghi file XML: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Đọc file XML và trả về đối tượng Java tương ứng
     * 
     * @param <T>      Kiểu trả về
     * @param fileName Đường dẫn tới file XML
     * @param clazz    Class của đối tượng cần đọc
     * @return Đối tượng đã đọc được hoặc null nếu lỗi
     */
    public static <T> T readXMLFile(String fileName, Class<T> clazz) {
        try {
            File file = new File(fileName);
            if (!file.exists()) {
                throw new FileNotFoundException("Không tìm thấy file: " + fileName);
            }

            JAXBContext context = JAXBContext.newInstance(clazz);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            Object result = unmarshaller.unmarshal(file);

            return clazz.cast(result);
        } catch (FileNotFoundException e) {
            System.err.println("File không tồn tại: " + e.getMessage());
        } catch (JAXBException e) {
            System.err.println("Lỗi khi đọc file XML: " + e.getMessage());
            e.printStackTrace();
        } catch (ClassCastException e) {
            System.err.println("Không thể ép kiểu đối tượng từ file XML");
        }

        return null;
    }
}
