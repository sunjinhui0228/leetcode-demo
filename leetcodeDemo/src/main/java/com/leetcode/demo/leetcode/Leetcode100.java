package com.leetcode.demo.leetcode;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sunjianjian
 * @date 2021年06月${日}0:00
 */
@RestController
@RequestMapping("/Leetcode100")
public class Leetcode100 {

    /**例：19的二进制100011 返回3
     * 求输入数字转化为2进制中1的个数
     * @author sunjianjian
     * @date 2021/6/23 19:32
     * @param n
     * @return int
     */
    @RequestMapping("/hammingWeight")
    public int hammingWeight(int n) {
        int res = 0;
        while (n != 0){
            res += n & 1; //若n&1 =1（则n的二进制最后一位为1） 则统计数res + 1
            n >>>= 1; //将二进制的数字无符号n 右移一位（去掉最一位）
        }
        return res;
    }

    @RequestMapping("/hammingWeight02")
    public int hammingWeight02(int n) {
        int res = 0;
        while (n != 0){
            res++;
            n &= n-1; //消去数字 n 最右边的 1
        }
        return res;
    }
}
