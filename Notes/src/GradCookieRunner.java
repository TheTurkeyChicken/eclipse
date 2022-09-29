import java.util.ArrayList;

public class GradCookieRunner {
	public static void main(String[] args) {
		GradCookieOrder choco = new GradCookieOrder("Chocolate Chips", 80);
		GradCookieOrder almond = new GradCookieOrder("Almond", 10);
		GradCookieOrder oatras = new GradCookieOrder("Oatmeal Raisin", 4);
		GradCookieOrder shtbrd = new GradCookieOrder("Shortbread", 40);
		GradCookieOrder pnutbt = new GradCookieOrder("Peanut Butter", 20);
		
		ArrayList<GradCookieOrder> list = new ArrayList<GradCookieOrder>();
		list.add(choco);
		list.add(almond);
		list.add(oatras);
		list.add(shtbrd);
		list.add(pnutbt);
		
		int maxOrdersIndx = -1, maxOrders = 0;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getAmount() > maxOrders) {
				maxOrdersIndx = i;
				maxOrders = list.get(i).getAmount();
			}
		}
		System.out.println(list.get(maxOrdersIndx));
		
		int cutoff = 12, i = 0;
		while(i < list.size()) {
			if(list.get(i).getAmount() < cutoff) {
				list.remove(i);
				continue;
			}
			i++;
		}
		
		System.out.println(list.size());
		for(int k = 0; k < list.size(); k++) {
			System.out.println(list.get(k));
		}
	}
}