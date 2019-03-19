package brut.apktool;

import brut.common.BrutException;

import java.io.IOException;

public class TestPack {

    public static void main(String[] args) throws InterruptedException, BrutException, IOException {
//        String cmd="b -f F:/union_sdk_new/game-packing-win32-x64-YunYu/core/workspace/game/maiyou/decompile -o F:/union_sdk_new/game-packing-win32-x64-YunYu/core/workspace/game/maiyou/output.apk";
//        String cmd="d -f C:\\Users\\hongliang\\Desktop\\aiqu-2019031917.apk -o C:\\Users\\hongliang\\Desktop\\aiqu";
        String cmd="b -f C:\\Users\\hongliang\\Desktop\\aiqu -o C:\\Users\\hongliang\\Desktop\\aiqu-2019031917_pack.apk";
        Main.main(cmd.split(" "));

    }
}
