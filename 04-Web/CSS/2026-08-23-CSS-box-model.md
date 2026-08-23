# [Box model]

> **一行要約: タグはその性質や用途に応じた領域サイズを持ち、これをボックスモデル（Box Model）と呼びます。**

---

<bar>

## 1.コア概念
* **[Box model]: 画面全体（横幅いっぱい）を占有するボックスモデルをブロックレベル要素（block-level element）、コンテンツ自身の大きさのみを持つものをインライン要素（inline-element）と呼びます。** 

* コード例
```html
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>box</title>
        <style>
            h1 {
                /* h1 タグが持つボックスモデルの境界線（ボーダー）を表示することができます。*/
                border-width: 5px;
                border-color: red;
                border-style: solid;

                /* ブロックレベル要素をインライン要素に変更することも可能です。*/
                /* value を none に設定すると、要素を非表示にすることもできます。*/
                display: inline;

                /* 内側の余白（padding）: ボックスモデルの内側（境界線の内側）に余白を設定します。*/
                padding: 20px;

                /* 外側の余白（margin）: ボックスモデルの外側（境界線の外側）に余白を設定します。*/
                margin: 20px;

                /* ブロックレベル要素は画面全体を使うだけでなく、幅や高さを指定してサイズを調整することもできます。*/
                width: 100px;
            }
        </style>
    </head>
    <body>
        <!-- h1 タグは画面全体（横幅いっぱい）を占有します。-->
        <h1>CSS</h1>Cascading Style Sheets.
    </body>
</html>
```
■ 開発者ツール

Webページ上で右クリックし、「検証」をクリックすると、サイトに使用されているボックスモデルを詳細に確認できます。