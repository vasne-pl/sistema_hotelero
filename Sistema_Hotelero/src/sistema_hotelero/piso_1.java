package sistema_hotelero;

public class piso_1 extends Sistema_Hotelero{
    
        private void Numero_de_habitacion(int habitacion){
        
        if (habitacion == 101){
            
            System.out.println("Ocupado");
        
        } else if(habitacion == 102){
            
            System.out.println("Disponible");
            
        } else {
            
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
