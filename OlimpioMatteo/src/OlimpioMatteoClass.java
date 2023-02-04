/**
 * 
 * @author olimp
 * <p>Matteo olimpio 4ai04/02/2023</p>
 *
 */
public class OlimpioMatteoClass {
	
	
	
/**
 *<p>calcolo produttoria</p>
 * 
 *  
 *  */
	public int Olimpiomet(int s,int f) {
		int r=0;
		for(int i=1;i<f;i++) {
			r = r + r;
		}
		return r;
	}
	/**
	 *<p>main test</p>
	 * @param args
	 */
	public static void main(String[] args) {
		OlimpioMatteoClass p=new OlimpioMatteoClass();
		 p.Olimpiomet(8, 10);
		System.out.println(p);
	}
}
