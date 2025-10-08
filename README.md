# Java PDF Viewer

Java ile geliştirilmiş basit bir PDF görüntüleyici uygulama.

## Özellikler

- PDF dosyalarını açma ve görüntüleme
- Temiz ve kullanıcı dostu arayüz
- Temel navigasyon (sayfa ileri/geri)

## Kullanılan Teknolojiler

- Java
- [Apache PDFBox](https://pdfbox.apache.org/) (veya kullandığınız diğer PDF kütüphanesi)

## Kurulum ve Çalıştırma

1. Projeyi klonlayın:
   ```sh
   git clone https://github.com/E-aydn/java-pdf-viewer.git
   cd java-pdf-viewer
   ```
2. Gerekli Java kütüphanelerini ekleyin (ör. PDFBox jar dosyalarını `lib` klasörüne ekleyin)
3. Uygulamayı derleyin ve çalıştırın:
   ```sh
   javac -cp "lib/*" src/Main.java
   java -cp "lib/*:src" Main
   ```

## Katkı

Katkılara ve pull request'lere açıktır.

## Lisans

MIT Lisansı

---

> 3 yıl önce öğrenme amaçlı geliştirilmiştir.
