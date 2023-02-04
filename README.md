# clerk-repro

Clerk seems to be pulling in `*.cljs` files from the static build glob.

Try it with

```
clojure -X:nextjournal/clerk
```

```sh
[sritchie@wintermute ~/code/clj/clerk-repro (main)]$ clj -X:nextjournal/clerk
👷🏼 Clerk is building 3 notebooks…
🧐 Parsing… Done in 33.770ms. ✅
🔬 Analyzing… Done in 116.592ms. ✅
🔨 Building "src/clerk_repro/notebook.clj"… Done in 15.605ms. ✅
🔨 Building "src/clerk_repro/test.cljs"… Errored in 5.166ms. ❌
🔨 Building "src/clerk_repro/notebook.clj"… Done in 5.237ms. ✅
Syntax error (ExceptionInfo) compiling at (test.cljs:5:1).
Syntax error compiling at (src/clerk_repro/test.cljs:5:1).
No such namespace: js
```
