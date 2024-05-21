
public class Joc {
	
	private String echipa1, echipa2;
	private int goluriEchipa1, goluriEchipa2, outuri, cornere;
	private Minge minge;

	public Joc(String echipa1, String echipa2,Minge minge) {
		super();
		this.echipa1 = echipa1;
		this.echipa2 = echipa2;
		this.goluriEchipa1 = 0;
		this.goluriEchipa2 = 0;
		this.outuri = 0;
		this.cornere =  0;
		this.minge = minge;
	}
	
	public String toString() {
		return "	" + echipa1 + "	" + echipa2 + "\n" + 
				"goluri	" + goluriEchipa1 + "		" + goluriEchipa2 + "\n" +
				"outuri	" + outuri + "\n" +
				"cornere	" + cornere;
	}
	
	public void simuleaza() {
		int i;
		for(i=1; i<=1000; i++) {
			try {
				System.out.println(echipa1 + "-" + echipa2 + " mingea se afla la coordonatele " + minge.getX() + "," + minge.getY());
				
				minge.pozitiaMingii(CoordinateGenerator.generateX(),CoordinateGenerator.generateY());
				minge.suteaza();
			} catch(Goal e) {
				if(minge.getX()==0)
					goluriEchipa1++;
				else
					goluriEchipa2++;
			   } catch(Out e) {
				   outuri++;}
					catch(Corner e) {
					cornere++;}
				}
			}
		}
	
