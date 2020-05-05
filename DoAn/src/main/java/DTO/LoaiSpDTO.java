/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Cong
 */
public class LoaiSpDTO {
  private String maLSp;
  private String tenLSp;
  public LoaiSpDTO(String maLSp, String tenLSp) {
    this.maLSp = maLSp;
    this.tenLSp = tenLSp;
  }
  /**
   * @return the maLSp
   */
  public String getMaLSp() {
    return maLSp;
  }

  /**
   * @param maLSp the maLSp to set
   */
  public void setMaLSp(String maLSp) {
    this.maLSp = maLSp;
  }

  /**
   * @return the tenLSp
   */
  public String getTenLSp() {
    return tenLSp;
  }

  /**
   * @param tenLSp the tenLSp to set
   */
  public void setTenLSp(String tenLSp) {
    this.tenLSp = tenLSp;
  }
  
  
}
