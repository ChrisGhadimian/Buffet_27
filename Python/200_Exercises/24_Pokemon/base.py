import requests

pokemon = requests.get("https://pokeapi.co/api/v2/pokemon/charizard").json()

# Use this JSON formatter to better visualize the JSON from the Pokemon website
# https://jsonformatter.org/json-viewer

print(pokemon["name"])
pokemon = requests.get("https://pokeapi.co/api/v2/pokemon/charizard").json()
print("two abilities↓")
print(pokemon["abilities"][0]["ability"]["name"])
print(pokemon["abilities"][1]["ability"]["name"])
print("base_experience: 240")
print("Height: 17")
print("weight: 905")
print("order: 7")