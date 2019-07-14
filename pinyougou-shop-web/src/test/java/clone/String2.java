package clone;
//复习对象引用，浅克隆
public class String2 {

	public static void main(String[] args) {
		StringBuilder builder1=new StringBuilder("谢念");
		StringBuilder builder2=builder1;
		
		System.out.println("builder1:"+builder1+";builder2:"+builder2);
		
		builder1.append("是个帅哥");
		
		System.out.println("builder1:"+builder1+";builder2:"+builder2);

		
		String a="我要学习";
		String b=a;
		
		System.out.println("a:"+a.hashCode()+";b:"+b.hashCode());
		
		a="天天向上，好好生活";
		
		System.out.println("a:"+a.hashCode()+";b:"+b.hashCode());

	}

}
