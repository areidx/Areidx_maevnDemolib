package com.itheima;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Auther: areidx
 * @Date: 20/10/28 18:09
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DemoLombok {
	private String name;
	private String nickname;
	private String birthday;
	private int age;
}
