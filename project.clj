(defproject ints "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0-alpha13"]
                 [org.clojure/data.codec "0.1.0"]
                 ]
  :plugins [[lein-auto "0.1.2"]
            [lein-cljfmt "0.3.0"]
            [lein-pprint "1.1.1"]
            [jonase/eastwood "0.2.3"]]
  :eastwood {:add-linters [:unused-namespaces
                           :unused-locals
                           :unused-private-vars]
             :exclude-linters [:constant-test]}
  :main ^:skip-aot ints.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
