package sistema_hotelero;

public class piso_3 extends Sistema_Hotelero{
    
        private void Numero_de_habitacion(int habitacion){
        
        if (habitacion == 301){
            
            System.out.println("Ocupado");
        
        } else if(habitacion == 302){
            
            System.out.println("Disponible");
            
        } else if (habitacion == 303){
            
            System.out.println("reservado");
            
        } else {
            
            System.out.println("La habitacion no existe.");
            
        }
    }
    
        @Override
    public void Valor_de_noche(){
        System.out.println("El valor por noche es de $350.000");
    }
        
    @Override
    public void Tipo_de_habitacion(){
        System.out.println("habitacion doble");
    }    
        
    @Override
    public void equipamento(){
        System.out.println("El quipamento es:");
        System.out.println("Dos camas, un televisor, dos abanico, dos lamparas de cama, un baño.");
    }
    
}
