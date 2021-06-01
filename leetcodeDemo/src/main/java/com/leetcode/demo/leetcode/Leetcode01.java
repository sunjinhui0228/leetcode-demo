package com.leetcode.demo.leetcode;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author sunjianjian
 * @date 2021年05月${日}23:04
 */
@RestController
@RequestMapping("/Leetcode01")
public class Leetcode01 {
    /**
     * 两数之和解法1
     * @author sunjianjian
     * @date 2021/5/31 23:08
     * @param nums
     * @param target
     * @return int[]
     */
    @RequestMapping("/twoSum")
    public int[] twoSum(int[] nums,Integer target){
        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            for (int j = i+1; j < n; ++j) {
                if (nums[i]+nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        System.out.println("hhhhhhhh");
        return new int[0];
    }

    /**
     * 两数之和解法2
     * @author sunjianjian
     * @date 2021/5/31 23:47
     * @param nums
     * @param target
     * @return int[]
     */
    @RequestMapping("/twoSum02")
    public int[] twoSum02(int[] nums,Integer target){
        Map<Integer,Integer> hashtable =  new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (hashtable.containsKey(target - nums[i])){
                return new int[]{hashtable.get(target - nums[i]),i};
            }
            hashtable.put(nums[i],i);
        }
        return new int[0];
    }
}
