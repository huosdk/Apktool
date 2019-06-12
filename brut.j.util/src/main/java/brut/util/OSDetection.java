/**
 * Copyright (C) 2018 Ryszard Wiśniewski <brut.alll@gmail.com>
 * Copyright (C) 2018 Connor Tumbleson <connor.tumbleson@gmail.com>
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package brut.util;

public class OSDetection {
    private static String OS = System.getProperty("os.name").toLowerCase();
    private static String Bit = System.getProperty("sun.arch.data.model").toLowerCase();

    /**
     * 修复64位系统使用32位的jdk获取的 System.getenv("PROCESSOR_ARCHITECTURE")一直是32的问题。
     * 以下修复方案在win下测试通过，其他系统待测试
     */
    static {
        if (System.getenv("PROCESSOR_ARCHITECTURE").toLowerCase().contains("64") || System.getenv("PROCESSOR_ARCHITEW6432").toLowerCase().contains("64")) {
            Bit = "64";
        } else {
            Bit = "32";
        }
    }

    public static boolean isWindows() {
        return (OS.contains("win"));
    }

    public static boolean isMacOSX() {
        return (OS.contains("mac"));
    }

    public static boolean isUnix() {
        return (OS.contains("nix") || OS.contains("nux") || OS.contains("aix") || (OS.contains("sunos")));
    }

    public static boolean is64Bit() {

        return Bit.equalsIgnoreCase("64");
    }

    public static String returnOS() {
        return OS;
    }

    public static void main(String[] args) {
        System.out.println(is64Bit());
    }
}
