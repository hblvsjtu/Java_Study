/**
 * 
 */
package practice;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * @author LvHongbin
 *
 */
public class Worker implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("At the tone, the time is " + new Date());
	}
}
