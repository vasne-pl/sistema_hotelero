package sistema_hotelero;

public class piso_2 extends Sistema_Hotelero{
    
        private void Numero_de_habitacion(int habitacion){
        
        if (habitacion == 201){
            
            System.out.println("Disponible");
        
        } else if(habitacion == 202){
            
            System.out.println("mantenimiento");
            
        } else{
            
            System.out.println("La habitacion no existe.");
            
        }
    }
    
    @Override
    public void Valor_de_noche(){
        System.out.println("El valor por noche es de $120.000");
    }
        
    @Override
    public void Tipo_de_habitacion(){
        System.out.println("habitacion sencilla");
    }    
        
    @Override
    public void equipamento(){
        System.out.println("El quipamento es:");
        System.out.println("Una cama, un baño, un avanico, y una lampara de cama.");
    }
    
}
