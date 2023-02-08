package com.restfullapi.jwt.services.download;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import org.springframework.jdbc.core.RowMapper;
import com.restfullapi.jwt.models.pic.myPicture;

public class downloadMapper implements RowMapper<myPicture> {
  int a = 0;

  @Override
  public myPicture mapRow(ResultSet rs, int i) throws SQLException {

    while (rs.next()) {
      a++;
      try {
        Blob aBlob = rs.getBlob("picture");
        InputStream is = aBlob.getBinaryStream(1, aBlob.length());
        BufferedImage image;
        image = ImageIO.read(is);

        try {

          // Retrieve Image
          File outputfile = new File("Cif00000" + a + ".png");
          ImageIO.write(image, "png", outputfile); // Write the Buffered Image into an

          ImageIO.read(new File("saved.png")); // Opening again as an Image
        } catch (Exception e) {

        }

      } catch (IOException e) {
        Logger lgr = Logger.getLogger(downloadMapper.class.getName());
        lgr.log(Level.SEVERE, e.getMessage(), e);
      }
    }
    // myPicture pic = new myPicture();
    // pic.setPic_id(rs.getString("pic_id"));
    // pic.setPicture(rs.getBlob("picture").getBytes(1, (int)
    // rs.getBlob("picture").length()));
    return null;

  }

}
