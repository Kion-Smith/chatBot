/*Name: Kion Smith
 * NetID: kls160430
 * CS2336-502
 * 
 *  user settings panel class
 *  	-creates everything inside the login panel
 */
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class userSettingsPanel extends JPanel
{
	//all elements for panel
	private JLabel userNameLabel,nickNameLabel,serverLabel,channelLabel;
	private JTextField userNameTextField,nickNameTextField,serverTextField,channelTextField;
	private JButton connectButton,disconnectButton;
	private TitledBorder userSettingsBorder;
	
	public userSettingsPanel()
	{
		//Instantiate label
		userNameLabel = new JLabel("Username");
		nickNameLabel= new JLabel("Nickname");
		serverLabel = new JLabel("Server");
		channelLabel= new JLabel("Channel");
		
		//Instantiate text field
		userNameTextField = new JTextField(20);
		nickNameTextField= new JTextField(20);
		serverTextField= new JTextField(20);
		channelTextField= new JTextField(20);
		
		//Instantiate buttons
		connectButton = new JButton("Connect");
		disconnectButton = new JButton("Disconnect");
		
		//set the textfields
		userNameTextField.setText("TestGuest");
		nickNameTextField.setText("KionsTestGuest");
		serverTextField.setText("irc.freenode.net");
		channelTextField.setText("#KionsChatTestRoom");
		
		//set border
		userSettingsBorder = BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "LOGIN");
		setBorder(userSettingsBorder);
		
		//set layout
		setLayout(new GridBagLayout() );
		GridBagConstraints gc = new GridBagConstraints();
		
		//add username label
		gc.gridx = 0;
		gc.gridy = 0;
		gc.anchor = GridBagConstraints.NORTHWEST;
		gc.insets = new Insets(15, 15, 0, 0);
		add(userNameLabel,gc);
		
		//add userName TextField
		gc.gridx = 1;
		gc.gridy = 0;
		gc.gridheight = 2;
		gc.ipadx = 100;
		gc.insets = new Insets(15, -70, 0, 0);
		add(userNameTextField,gc);
		
		//add server Label
		gc.gridx = 0;
		gc.gridy = 2;
		gc.insets = new Insets(15, 15, 0, 0);
		add(serverLabel,gc);
		
		//add server TextField
		gc.gridx = 1;
		gc.gridy = 2;
		gc.gridheight = 2;
		gc.ipadx = 100;
		gc.insets = new Insets(15, -70, 0, 0);
		add(serverTextField,gc);
		
		//add channel Label
		gc.gridx = 2;
		gc.gridy = 2;
		gc.insets = new Insets(15, 50, 0, 0);
		add(channelLabel,gc);
		
		//add channel TextField
		gc.gridx = 3;
		gc.gridy = 2;
		gc.gridheight = 2;
		gc.ipadx = 100;
		gc.insets = new Insets(15, -80, 0, -80);
		add(channelTextField,gc);
		
		//add nickName Label
		gc.gridx = 2;
		gc.gridy = 0;
		gc.insets = new Insets(15, 50, 0, 0);
		add(nickNameLabel,gc);
		
		//add nickName TextField
		gc.gridx = 3;
		gc.gridy = 0;
		gc.gridheight = 2;
		gc.ipadx = 100;
		gc.insets = new Insets(13, -80, 0, -80);
		add(nickNameTextField,gc);
		
		//add connect Button
		gc.gridx = 4;
		gc.gridy = 0;
		gc.gridheight = 4;
		gc.ipadx = 27;
	    gc.ipady = 10;
	    gc.insets = new Insets(0, 40, 0, -70);
		add(connectButton,gc);
		
		//add disconnect Button
		gc.gridx = 4;
		gc.gridy = 1;
		gc.gridheight = 4;
		gc.ipadx = 10;
		gc.ipady = 10;
		gc.insets = new Insets(10, 40, 10, -70);
		add(disconnectButton,gc);
		

		
		
	}
	
	public JLabel getUsernameLabel()
	{
		return userNameLabel;
	}
	public JLabel getNicknameLabel()
	{
		return nickNameLabel;
	}
	public JLabel getServerLabel()
	{
		return serverLabel;
	}
	public JLabel getChannelLabel()
	{
		return channelLabel;
	}
	public JTextField getUsernameTextField()
	{
		return userNameTextField;
	}
	public JTextField getNicknameTextField()
	{
		return nickNameTextField;
	}
	public JTextField getServerTextField()
	{
		return serverTextField;
	}
	public JTextField getChannelTextField()
	{
		return channelTextField;
	}
	public JButton getConnectButton()
	{
		return connectButton;
	}
	public JButton getDisconnectButton()
	{
		return disconnectButton;
	}
	public TitledBorder getUserSettingsBorder()
	{
		return userSettingsBorder;
	}
	//setters
	public void setUsernameLabel(JLabel j)
	{
		userNameLabel = j;
	}
	public void setNicknameLabel(JLabel j)
	{
		nickNameLabel = j;
	}
	public void setServerLabel(JLabel j)
	{
		serverLabel = j;
	}
	public void setChannelLabel(JLabel j)
	{
		channelLabel = j;
	}
	public void setUsernameTextField(JTextField j)
	{
		userNameTextField = j;
	}
	public void setNicknameTextField(JTextField j)
	{
		nickNameTextField = j;
	}
	public void setServerTextField(JTextField j)
	{
		serverTextField = j;
	}
	public void setChannelTextField(JTextField j)
	{
		channelTextField = j;
	}
	public void setConnectButton(JButton j)
	{
		 connectButton = j;
	}
	public void setDisconnectButton(JButton j)
	{
		 disconnectButton=j;
	}
	public void setUserSettingsBorder(TitledBorder b)
	{
		userSettingsBorder =b;
	}
}
