package brut.apktool;

import brut.common.BrutException;

import java.io.IOException;

public class TestPack {

    public static void main(String[] args) throws InterruptedException, BrutException, IOException {
        String cmd="b -f F:/union_sdk_new/game-packing-win32-x64-YunYu/core/workspace/game/maiyou/decompile -o F:/union_sdk_new/game-packing-win32-x64-YunYu/core/workspace/game/maiyou/output.apk";
        Main.main(cmd.split(" "));

    }
}
