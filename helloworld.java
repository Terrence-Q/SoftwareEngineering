//回文串判断
import javax.swing.JOptionPane;
public class Huiwen {

	public static void main(String[] args)
	  {
	     String  s1=JOptionPane.showInputDialog("请输入字符串:");
	     StringBuffer s2=new StringBuffer(s1);
	     s2.reverse();
	     if(s2.toString().equals(s1))
			 JOptionPane.showMessageDialog(null,s1+"是回文");
	     else
			 JOptionPane.showMessageDialog(null,s1+"不是回文");
		 System.exit(0);
	  }

}

