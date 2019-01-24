# 11_dispatch
課題11用　リポジトリ

課題11：JSP→サーブレット→JSPへ
　　　　　　画面遷移
　（課題10＋ディスパッチ処理＋処理分割）
 
初めに:
課題10をコピーし課題11を作る。
そこへ新規に(最初からあったJSPファイル名)＋_ok.jsp（以後JSP_ok）を作り、JSP_okを正しい値を入力した場合に送られる確認画面として完成させる。

経過:
12/20 JSP→サーブレット→JSP_okの画面遷移とその値の受け渡しテストに成功。
1/10　複数の値の受け渡しに成功　次回はコーデバトル用のコーデを整える。 参考価格(UMP45 3,000$)


その他（次回に向けてのメモ等）:
ジャンルのところのif分をしっかり完成させる、
けど多分忘れてると思う
例
    // gは["3"]かもしれないし、["0", "2", "3"] かもしれない

        // a例 ）g["3"]の時
        /*<input type="checkbox" name="genre" value="0" disabled /> 文芸
        <input type="checkbox" name="genre" value="1" disabled /> 実用
        <input type="checkbox" name="genre" value="2" disabled /> ビジネス
        <input type="checkbox" name="genre" value="3" disabled checked="checkd"/>教養
        <input type="checkbox" name="genre" value="4" disabled  /> 趣味*/
        	
         // 例）g["0", "2", "3"]の時
         /*<input type="checkbox" name="genre" value="0" disabled checked="checkd" /> 文芸
         <input type="checkbox" name="genre" value="1" disabled /> 実用
         <input type="checkbox" name="genre" value="2" disabled checked="checkd" /> ビジネス
         <input type="checkbox" name="genre" value="3" disabled checked="checkd" /> 教養
         <input type="checkbox" name="genre" value="4" disabled  /> 趣味*/
        		
<input type="checkbox" name="genre" value="x"までは固定　その後をloopで回す(?)
