package com.cn.groupanagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class GroupAnagrams {
	
	public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0) {
        	return new ArrayList<List<String>>();
        }
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for(String str : strs) {
        	char[] ca = str.toCharArray();
        	Arrays.sort(ca);
        	String keyStr = String.valueOf(ca);
        	if(!map.containsKey(keyStr)) {
        		map.put(keyStr, new ArrayList<String>());
        	}
        	map.get(keyStr).add(str);
        }
        for(String key: map.keySet()) {
            Collections.sort(map.get(key));
        }
        return new ArrayList<List<String>>(map.values());
    }
	public static void main(String[] args) {
		String[] strs = {"dsf","dfs","des","sed","vew","ece"};
		List<List<String>> list = new ArrayList<List<String>>();
		GroupAnagrams ga = new GroupAnagrams();
		list = ga.groupAnagrams(strs);
		System.out.print(list);
	}
}


//			String str = " ";
//			str = str.trim();
//			System.out.print("".equals(str));
		
//			String accountNo = "24314534";
//			String accountNoRegex = "[0-9]+";
//			boolean flag = accountNo.matches(accountNoRegex);
//			System.out.print(flag);
//		
//  		String accountNo = null;
//		    String accountName = "dfas";
//		    if(StringUtils.isEmpty(accountNo) && StringUtils.isEmpty(accountName)) {
//				System.out.print("Hello world");
//			} 
//			

    

