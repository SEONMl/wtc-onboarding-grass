## ๐ ๊ธฐ๋ฅ ์๊ตฌ ์ฌํญ

์ํธ๋ฌธ์ ์ข์ํ๋ ๊ดด์ง ๊ฐ๋ฐ์ ๋ธ๋ผ์ด์ด ์ด๋ฒ์๋ ์ค๋ณต ๋ฌธ์๋ฅผ ์ด์ฉํ ์๋ก์ด ์ํธ๋ฅผ ๋ง๋ค์๋ค. ์๋ฅผ ๋ค์ด "browoanoommnaon"์ด๋ผ๋ ์ํธ๋ฌธ์ ๋ค์๊ณผ ๊ฐ์ ์์๋ก ํด๋ํ  ์ ์๋ค.

1. "browoanoommnaon"
2. "browoannaon"
3. "browoaaon"
4. "browoon"
5. "brown"

์์์ ๋ฌธ์์ด cryptogram์ด ๋งค๊ฐ๋ณ์๋ก ์ฃผ์ด์ง ๋, ์ฐ์ํ๋ ์ค๋ณต ๋ฌธ์๋ค์ ์ญ์ ํ ๊ฒฐ๊ณผ๋ฅผ return ํ๋๋ก solution ๋ฉ์๋๋ฅผ ์์ฑํ๋ผ.

### ์ ๋ฆฌ
1. ์ํธ๋ฌธ Cryptogram class ์์ฑ
2. origin ์ํธ๋ฌธ์ ๋ณต์ ํ duplication field ์ด๊ธฐํ ๋ฉ์๋ ์์ฑ
3. ๋ฐ๋ณต๋๋ ๋ฌธ์๊ฐ ์๋์ง ํ์ธํ๋ ๋ฉ์๋ ์์ฑ
4. duplication์ ํ์ํ๋ ๋ฉ์๋ ์์ฑ
5. duplication์ ๋ฐ๋ณต๋๋ ๋ฌธ์๊ฐ ์์ ๋๊น์ง ์ํํ๋ decode ๋ฉ์๋ ์์ฑ

### ์ ํ์ฌํญ

- cryptogram์ ๊ธธ์ด๊ฐ 1 ์ด์ 1000 ์ดํ์ธ ๋ฌธ์์ด์ด๋ค.
- cryptogram์ ์ํ๋ฒณ ์๋ฌธ์๋ก๋ง ์ด๋ฃจ์ด์ ธ ์๋ค.

### ์คํ ๊ฒฐ๊ณผ ์์

| cryptogram | result |
| --- | --- |
| "browoanoommnaon" | "brown" |
| "zyelleyz" | "" |
