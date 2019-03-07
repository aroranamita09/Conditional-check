package com.stackroute;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
public class ConditionalCheckTest {
    ConditionalCheck obj;
    @Before
    public void setUp() throws Exception {
        obj = new ConditionalCheck();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }

    @Test
    public void checkIsVowel(){
        String str="abcdeuio";
        char[] strArr=str.toCharArray();
        Map<Character, String> hmap1 = new HashMap<>();

        for (char s:strArr)
        {
            if(s=='a'||s=='e'||s=='i'||s=='o'||s=='u')

            {
                hmap1.put(s,"vowel");
            }

            else   {hmap1.put(s,"consonant");}
        }
        assertEquals(hmap1,obj.checkIsVowel(str));
    }


    


}
