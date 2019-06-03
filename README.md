# iVISION (Smart Glasses for blind)
Image captioning using CNN,RNN and LSTM

Dataset used : Flicker8k

Model workflow : 

1. Object detection / Image Captioning: We have used trained (on ImageNet)  CNN. 
2. Language modeling: USED RNN with LSTM  
3. Text to audio conversion: TTS (text to speech) using python standard libraries.   

Objective : 

To overcome the travelling difficulty for the visually impaired group, this project aims at providing personalized assistance for blind and low-vision people to help them gain greater mobility, independence, efficiency and self-assurance. Providing a smarter and efficient way to communicate to the real world.

iVision is a wearable smart camera device built with a powerful microcontroller that has  the ability to see what we, normal people, are seeing. The device aims to improve the quality of life for the blind and visually impaired people and makes them understand their surroundings in a clear way as close as to a normal person at an affordable cost.   

The device consists of camera sensor based vision module, which can capture up to VGA resolution pictures. Smart kit includes a smart glass vision equipped with a real time camera to feed real word captured images to the machine learning model, which further processes the image and using the trained convolutional neural network giving  out the precise features from the image. Features extracted then are captioned through LSTM and with the help of Recurrent nets the captioned text is converted to a meaningful sentence. Further the data retrieved is converted to audio and transmitted to the subject’s ear .
