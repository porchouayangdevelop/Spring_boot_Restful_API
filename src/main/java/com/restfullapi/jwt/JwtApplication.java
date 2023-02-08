package com.restfullapi.jwt;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JwtApplication {

  // @Value("${upload.path}")

  public static void main(String[] args) throws SQLException, FileNotFoundException, IOException {
    SpringApplication.run(JwtApplication.class, args);
    String fileName = "/home/download";
    Path path = Paths.get(fileName);
    Files.createDirectories(path);

    String url = "jdbc:mysql://localhost:3306/jwt_security?useSSL=false&serverTimezone=UTC";
    String username = "root";
    String password = "";
    // String driver = "com.mysql.cj.jdbc.Driver";

    String sql = "SELECT picture FROM user_pic";

    // try (Connection con = DriverManager.getConnection(url, username, password);
    // PreparedStatement ps = con.prepareStatement(sql);
    // ResultSet rs = ps.executeQuery()) {
    // int a = 0;

    // while (rs.next()) {
    // a++;
    // Blob aBlob = rs.getBlob("picture");
    // // byte[] bytes = aBlob.getBytes(1, (int) aBlob.length());
    // InputStream is = aBlob.getBinaryStream(1, aBlob.length());
    // BufferedImage image = ImageIO.read(is);

    // try {
    // Date date = new Date(System.currentTimeMillis());

    // // Retrieve Image
    // File outputfile = new File(date.toString() + a + ".png");
    // ImageIO.write(image, "png", outputfile); // Write the Buffered Image into an

    // ImageIO.read(new File(fileName + "saved.png")); // Opening again as an Image

    // } catch (IOException e) {

    // }

    // }

    // } catch (SQLException e) {
    // Logger lgr = Logger.getLogger(JwtApplication.class.getName());
    // lgr.log(Level.SEVERE, e.getMessage(), e);
    // }

  }

}
