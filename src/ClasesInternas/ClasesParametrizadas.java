package ClasesInternas;

import java.util.ArrayList;
import java.util.List;

public class ClasesParametrizadas<T> {
	private List<T> lista = new ArrayList<T>();
	public void addElemento(T elemento){
		lista.add(elemento);
	}
	public T getElemento(int i){
		if (i>=0 && i<lista.size()){
			return lista.get(i);
		} else {
			return null;
		}
	}
	@Override
	public String toString() {
		return "ClasesParametrizadas [lista=" + lista + "]";
	}
	
	
}
