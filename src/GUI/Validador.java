/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.util.regex.Pattern;

/**
 *
 * @author Matt
 */
public class Validador {
    
    public boolean verificarCedula(String cedula) {
        if (cedula.length() != 10) {
            return false;
        }
        
        int[] coeficientes = {2, 1, 2, 1, 2, 1, 2, 1, 2};
        int total = 0;
        
        for (int i = 0; i < coeficientes.length; i++) {
            int digito = Character.getNumericValue(cedula.charAt(i));
            int producto = digito * coeficientes[i];
            
            if (producto >= 10) {
                producto -= 9;
            }
            
            total += producto;
        }
        
        int ultimoDigito = Character.getNumericValue(cedula.charAt(9));
        int modulo = total % 10;
        int digitoVerificador = (modulo == 0) ? 0 : 10 - modulo;
        
        return ultimoDigito == digitoVerificador;
    }
    
    public boolean validarCedula(String cedula){
        String regex = "^(0[1-9]|1[0-9]|2[0-4])[0-9]{8}$";
        return Pattern.matches(regex, cedula);
    }
    
    public boolean validarCorreo(String correo){
        String regex = "^[A-Za-z0-9._%+-]+@(gmail\\.com|hotmail\\.com|uta\\.edu\\.ec|outlook\\.com)$";
        return Pattern.matches(regex, correo);
    }
    
    public boolean validarTelefono(String telefono){
        String regex = "^09[0-9]{8}$";
        return Pattern.matches(regex, telefono);
    }
    
}
