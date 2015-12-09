package org.jadson;

import org.apache.commons.collections.list.GrowthList;

/**
 * 
 * @author augusto dantas 
 *
 * <p><i>This program is distributed without any warranty and it
 * can be freely redistributed for research, classes or private studies, 
 * since the copyright notices are not removed.</i></p>
 *
 */
public class User extends Person{
	
    /** O nome da pessoa*/
    private String senha;
	private String login
    public User(String login, String senha) {
        this.login = login;
		this.senha = senha;
    }
}
