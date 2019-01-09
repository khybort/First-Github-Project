-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Anamakine: localhost:3306
-- Üretim Zamanı: 27 Ara 2018, 15:24:03
-- Sunucu sürümü: 5.7.24
-- PHP Sürümü: 7.2.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `hastane`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `adminler`
--

CREATE TABLE `adminler` (
  `username` text COLLATE utf8_turkish_ci NOT NULL,
  `password` text COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `adminler`
--

INSERT INTO `adminler` (`username`, `password`) VALUES
('admin', 'admin');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `doktorlar`
--

CREATE TABLE `doktorlar` (
  `id` int(11) NOT NULL,
  `adi` text COLLATE utf8_turkish_ci NOT NULL,
  `soyadi` text COLLATE utf8_turkish_ci NOT NULL,
  `bolum` text COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `doktorlar`
--

INSERT INTO `doktorlar` (`id`, `adi`, `soyadi`, `bolum`) VALUES
(1, 'Ahmet', 'Gürsoy', 'Kardiyoloji'),
(2, 'Fatma', 'Altıparlak', 'Dermatoloji'),
(3, 'Ali', 'Atabak', 'klinik Psikoloji'),
(4, 'Ziya', 'Hoşgül', 'Hematoloji');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `hastalar`
--

CREATE TABLE `hastalar` (
  `id` int(11) NOT NULL,
  `adi` text COLLATE utf8_turkish_ci NOT NULL,
  `soyadi` text COLLATE utf8_turkish_ci NOT NULL,
  `tc` text COLLATE utf8_turkish_ci NOT NULL,
  `tel` text COLLATE utf8_turkish_ci NOT NULL,
  `tarih` text COLLATE utf8_turkish_ci NOT NULL,
  `doktor_adi` text COLLATE utf8_turkish_ci NOT NULL,
  `doktor_soyadi` text COLLATE utf8_turkish_ci NOT NULL,
  `doktor_bolumu` text COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `hastalar`
--

INSERT INTO `hastalar` (`id`, `adi`, `soyadi`, `tc`, `tel`, `tarih`, `doktor_adi`, `doktor_soyadi`, `doktor_bolumu`) VALUES
(12, 'Sabri', 'Alçalı', '652561', '584564', '20-12-1990', 'Ziya', 'Hoşgül', 'Hematoloji'),
(13, 'Hayati', 'Gül', '354151541', '45121241241', '25-06-1998', 'Fatma', 'Altıparlak', 'Dermatoloji'),
(14, 'Mahmut', 'Esat', '12063555858', '545121512', '25-06-1998', 'Ziya', 'Hoşgül', 'Hematoloji'),
(15, 'Nuran', 'Akbaş', '154153125151', '45121241241', '24-06-1996', 'Fatma', 'Altıparlak', 'Dermatoloji'),
(16, 'Necati', 'Akbaş', '545652561', '54584564', '20-12-1990', 'Ziya', 'Hoşgül', 'Hematoloji'),
(17, 'Ayşe', 'Kalara', '545652561', '54584564', '20-12-1990', 'Ziya', 'Hoşgül', 'Hematoloji');

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `doktorlar`
--
ALTER TABLE `doktorlar`
  ADD PRIMARY KEY (`id`);

--
-- Tablo için indeksler `hastalar`
--
ALTER TABLE `hastalar`
  ADD PRIMARY KEY (`id`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `doktorlar`
--
ALTER TABLE `doktorlar`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Tablo için AUTO_INCREMENT değeri `hastalar`
--
ALTER TABLE `hastalar`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
