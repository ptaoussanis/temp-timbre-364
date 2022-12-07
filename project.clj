(defproject stage "4.0.0"

  :description ""
  :url ""

  :dependencies 
  [#_[org.clojure/clojurescript "1.11.60"]
   [thheller/shadow-cljs "2.20.13" :scope "provided"]
   #_[com.taoensso/encore "3.37.1"] ; Works
   #_[com.taoensso/encore "3.42.0"] ; Fails
     [com.taoensso/encore "3.43.0"] ; Works
   ]

  :min-lein-version "2.0.0"

  :source-paths ["src/clj" "src/cljs"]
  :test-paths ["test/clj"]
  :resource-paths ["resources" "target/cljsbuild"]
  :target-path "target/%s/"
  :main ^:skip-aot stage.core

  :plugins [] 
  :clean-targets ^{:protect false}
  [:target-path "target/cljsbuild"]

  :profiles
  {:uberjar {:omit-source true
             :prep-tasks ["compile" ["run" "-m" "shadow.cljs.devtools.cli" "release" "app"]]
             :aot :all
             :uberjar-name "stage.jar"
             :source-paths ["env/prod/clj"  "env/prod/cljs"]}})
