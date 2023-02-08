package com.restfullapi.jwt.services.download;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.RowMapper;
import com.restfullapi.jwt.models.pic.myPicture;

public class downloadMapper implements RowMapper<myPicture> {
  int a = 0;
  Date date = new Date(System.currentTimeMillis());

  private final static String EXTERNAL_FILE_PATH = "C:/fileDownloadExample/";

  @Override
  public myPicture mapRow(ResultSet rs, int index) throws SQLException {

    while (rs.next()) {
      a++;
      Blob aBlob = rs.getBlob("picture");
      InputStream is = aBlob.getBinaryStream(1, aBlob.length());
      try {
        BufferedImage image = ImageIO.read(is);

        File outputfile = new File(EXTERNAL_FILE_PATH + rs.getString("pic_id").toString() + a + ".png");
        ImageIO.write(image, "png", outputfile);
        ImageIO.read(new File("saved.png"));
      } catch (IOException e) {

      }

    }
    return null;
  }

}
