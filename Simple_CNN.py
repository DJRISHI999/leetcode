'''You are given a dataset of customer feedback comments on a product, with each comment labeled as either "positive" or "negative." Your task is to build a text classification model using the Logistic Regression/Naive Bayes algorithm. Perform the following steps: 
 Preprocess the text data by removing punctuation, converting to lowercase, and tokenizing the text. 
 Use TfidfVectorizer to convert the text data into numerical features. 
 Train a Logistic Regression classifier to predict the sentiment (positive or negative) of the reviews. 
 Evaluate the model's performance using accuracy on a test dataset. 
 Dataset format:
 "The product is great, I'm very happy!"  positive
"Terrible, do not buy this product!"  negative
"Excellent quality, highly recommend." positive
"It broke after a few uses." negative'''

import pandas as pd
import numpy as np
import re
import string
import seaborn as sns
import matplotlib.pyplot as plt
import nltk

from sklearn.model_selection import train_test_split
from sklearn.feature_extraction.text import TfidfVectorizer
from sklearn.linear_model import LogisticRegression
from sklearn.metrics import accuracy_score, classification_report, confusion_matrix
from sklearn.pipeline import Pipeline
from sklearn.naive_bayes import MultinomialNB
from sklearn.preprocessing import LabelEncoder  


# Sample dataset creation
data = {
    'text': [
        "The product is great, I'm very happy!",
        "Terrible, do not buy this product!",
        "Excellent quality, highly recommend.",
        "It broke after a few uses."
    ],
    'label': ['positive', 'negative', 'positive', 'negative']
}
df = pd.DataFrame(data)

# Preprocessing function
def preprocess_text(text):
    # Remove punctuation
    text = text.translate(str.maketrans('', '', string.punctuation))
    # Convert to lowercase
    text = text.lower()
    # Tokenize the text
    tokens = text.split()
    return ' '.join(tokens)

# Apply preprocessing to the text data
df['text'] = df['text'].apply(preprocess_text)

# Encode labels
label_encoder = LabelEncoder()
df['label'] = label_encoder.fit_transform(df['label'])

# Split the dataset into training and testing sets
X_train, X_test, y_train, y_test = train_test_split(df['text'], df['label'], test_size=0.2, random_state=42)

# Create a pipeline with TfidfVectorizer and Logistic Regression
pipeline = Pipeline([
    ('tfidf', TfidfVectorizer()),
    ('classifier', LogisticRegression())
])

# Train the model
pipeline.fit(X_train, y_train)

# Make predictions on the test set
y_pred = pipeline.predict(X_test)

# Evaluate the model's performance
accuracy = accuracy_score(y_test, y_pred)
print(f'Accuracy: {accuracy:.2f}')
print("Classification Report:")
print(classification_report(y_test, y_pred, target_names=label_encoder.classes_))
print("Confusion Matrix:")
print(confusion_matrix(y_test, y_pred))



