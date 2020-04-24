//回文串判断
import javax.swing.JOptionPane;
public class Huiwen {

	public static void main(String[] args)
	  {
	     String  s1=JOptionPane.showInputDialog("请输入字符串:");
	     StringBuffer s2=new StringBuffer(s1);
	     s2.reverse();
	  }

}

