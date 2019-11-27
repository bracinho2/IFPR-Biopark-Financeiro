///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package voy.me.pay.entity;
//
//import java.io.BufferedReader;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import static jdk.nashorn.internal.objects.ArrayBufferView.buffer;
//
///**
// *
// * @author BrAcInhO
// */
//public class ArquivoTextoSalva {
//    
//    private String caminho;
//    private String nome;
//    
////    public String[] lerArquivo(String caminho) { 
////        
//////       BufferedReader buffRead = null;
////       String [] retorno = null;
//////       
//////        try {
//////            
//////            buffRead = new BufferedReader(new FileReader(caminho));
//////        
//////       String linha = "";
//////       while (true) {
//////            if (linha != null) {
//////                System.out.println(linha);
////// 
//////            } else
//////                break;
//////           
//////               linha = buffRead.readLine();
//////           
//////        }
//////       
//////            buffRead.close();
//////                
//////        } catch (FileNotFoundException ex) {
//////            Logger.getLogger(ArquivoTextoSalva.class.getName()).log(Level.SEVERE, null, ex);
//////        }
//////        
//////        catch (IOException ex) {
//////               Logger.getLogger(ArquivoTextoSalva.class.getName()).log(Level.SEVERE, null, ex);
//////           }
//////        
////        return retorno;
////    }
//        
//        
//    
//    public boolean gravarArquivo(){
//        return true;
//    }
//
//    public String getCaminho() {
//        return caminho;
//    }
//
//    public void setCaminho(String caminho) {
//        this.caminho = caminho;
//    }
//
//    public String getNome() {
//        return nome;
//    }
//
//    public void setNome(String nome) {
//        this.nome = nome;
//    }
//
//       
//}
