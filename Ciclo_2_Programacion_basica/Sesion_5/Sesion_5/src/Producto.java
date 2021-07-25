/*Objeto que genenera 4 atributos y tiene una función que regresa un true si no no hay productos y 
false si hay productos*/
public class Producto {
    private int codigo;
    private int precioDeCompra;
    private int cantidadEnBodega;
    private int cantidadMinima;


    public Producto(int codigo, int precioDeCompra, int cantidadEnBodega, int cantidadMinima) {
        this.codigo = codigo;
        this.precioDeCompra = precioDeCompra;
        this.cantidadEnBodega = cantidadEnBodega;
        this.cantidadMinima = cantidadMinima;
    }

    public boolean solicitarPedido() {
        if (cantidadEnBodega < cantidadMinima){
            return true;
        }else{
            return false;
        }        
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPrecioDeCompra() {
        return this.precioDeCompra;
    }

    public void setPrecioDeCompra(int precioDeCompra) {
        this.precioDeCompra = precioDeCompra;
    }

    public int getCantidadEnBodega() {
        return this.cantidadEnBodega;
    }

    public void setCantidadEnBodega(int cantidadEnBodega) {
        this.cantidadEnBodega = cantidadEnBodega;
    }

    public int getCantidadMinima() {
        return this.cantidadMinima;
    }

    public void setCantidadMinima(int cantidadMinima) {
        this.cantidadMinima = cantidadMinima;
    }
    
}


