import pyautogui

print(pyautogui.size())
print(pyautogui.position())

# pyautogui.moveTo(x=548, y=19)
# pyautogui.click()
img = pyautogui.locateOnScreen('./220711/help.png',confidence=0.9)
pyautogui.click(img)