from setuptools import setup, find_packages

setup(
    name="HeroLang",
    version="0.19",
    install_requires=[
        "antlr4-python3-runtime",
        "pygame",
        "numpy"
    ],

    packages=['HeroLang'],
    entry_points={
        'console_scripts': [
            'HeroLang = HeroLang.antlr:main',
        ],
    }
)
