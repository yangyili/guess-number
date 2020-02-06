### 题目规则说明
<p>
实现猜数字的游戏。游戏有四个格子，每个格子有一个0到9的数字，任意两个格子的数字都不一样。你有6次猜测的机会，如果猜对则获胜，否则失败。每次猜测时需依序输入4个数字，程序会根据猜测的情况给出xAxB的反馈，A前面的数字代表位置和数字都对的个数，B前面的数字代表数字对但是位置不对的个数。
<br />
例如：答案是1 2 3 4， 那么对于不同的输入，有如下的输出
</p>
<table>
    <thead>
        <tr>
            <td>input</td>
            <td>output</td>
            <td>instruction</td>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>1567</td>
            <td>1A0B</td>
            <td>1 correct</td>
        </tr>
        <tr>
            <td>2478</td>
            <td>0A2B</td>
            <td>2 and 4 wrong position</td>
        </tr>
        <tr>
            <td>0324</td>
            <td>1A2B</td>
            <td>4 correct，2 and 3 wrong position</td>
        </tr>
    </tbody>
</table>
<p>
答案在游戏开始时随机生成。输入只有6次机会，在每次猜测时，程序应给出当前猜测的结果，以及之前所有猜测的数字和结果以供玩家参考。 在6次之内猜对，返回4A0B，并输出“Congratulations, you win!”，然后游戏结束（结束程序）。
</p>
