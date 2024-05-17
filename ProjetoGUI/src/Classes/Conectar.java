/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import DAO.ConnectionFactory;

/**
 *
 * @author erica
 */
public class Conectar {
    public static void main(String []args)
    {
    ConnectionFactory factory = new ConnectionFactory();
    factory.obtemConexao();
    }
    
}
