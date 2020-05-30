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
public class LoaiSP {
  public String maLSp;
  public String tenLSp;
  public LoaiSP(String maLSp, String tenLSp) {
    this.maLSp = maLSp;
    this.tenLSp = tenLSp;
  }
  public LoaiSP( String tenLSp) {
    this.tenLSp = tenLSp;
  }
}
